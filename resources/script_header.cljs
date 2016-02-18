(ns NS-NAME.core
  (:require-macros [cljs.core.async.macros :refer [go go-loop]])
  (:require [cljs.core.async :refer [<! >! put! chan] :as async]
            [cljs.nodejs     :as node]
            [cljs.tools.cli  :refer [parse-opts]]))

(node/enable-util-print!)

(def readline (node/require "readline"))

(defn stdin->chan []
  (let [c (chan)]
    (doto (.createInterface readline
                            (clj->js {:input (.-stdin js/process)
                                      :terminal false}))
      (.on "line" #(put! c %))
      (.on "close" #(async/close! c)))
    c))
