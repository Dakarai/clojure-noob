(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "I'm a little teapot!")
  1
  "a string"
  ["a" "vector" "of" "strings"]
  (if true
    "By Zeus' Hammer!"
    "By Aquaman's Trident!")
  (if false
    "By Odin's Elbow!")
  (if true
    (do (println "Success!")
        "By Zeus' Hammer!")
    (do (println "Failure!")
        "By Aquaman's Trident!"))
  )
