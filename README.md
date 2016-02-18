# Trile

A clojure library and some dirty shell helpers to help you compile
cljs scripts on the fly.

## Usage

run ./install.sh
put trile on your path

Write any clojurescript for node with the

```
#!/path/to/trile
```

shebang. Example:

```clojure
#!/home/rasmus/bin/trile

(defn -main [& args]
  (go (println (<! (stdin->chan))))
  (println "Hello world!"))
```

core.async functions will be magically available, as well as a function stdin->chan and clojure/tools.cli.

Scripts will be compiled when changed, and just called otherwise.

Have fun!

## License

Copyright © 2016 Rasmus Buchmann

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
