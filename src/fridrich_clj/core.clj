(ns fridrich-clj.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))


(def pll {
          [[1 1 0] [0 0 0] [0 0 0] [1 0 1]] "R-perm-a"
          []
          })

(pll [[1 1 2] [3 2 1] [2 3 4] [4 3 4]])
