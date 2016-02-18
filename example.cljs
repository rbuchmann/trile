#!/home/rasmus/bin/trile

(defn -main [& args]
  (go (println (<! (stdin->chan))))
  (println "Hello world!"))
