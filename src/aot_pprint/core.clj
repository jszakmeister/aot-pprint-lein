(ns aot-pprint.core
  (:require [clojure.pprint :refer [pprint]])
  (:gen-class))

(defn -main [& args]
  (pprint [1 2 3 4 5]))
