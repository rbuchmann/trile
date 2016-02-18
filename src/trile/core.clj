(ns trile.core
  (:gen-class)
  (:require [cljs.build.api :as cljs]))

(defn -main [script-name]
  (cljs/build "src" {:output-to  (str script-name ".js")
                     :target :nodejs
                     :main (symbol (str script-name ".core"))}))
