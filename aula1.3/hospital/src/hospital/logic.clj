(ns hospital.logic)


(defn chega-em
  [hospital departamento pessoa]
    (update hospital departamento conj pessoa))

(defn atende
  [hospital departamento]
  (update hospital departamento pop))