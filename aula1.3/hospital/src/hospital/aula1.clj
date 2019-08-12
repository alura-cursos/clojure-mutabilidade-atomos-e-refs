(ns hospital.aula1
  (:use [clojure pprint])
  (:require [hospital.model :as h.model]
            [hospital.logic :as h.logic]))

(defn simula-um-dia []
  ; root binding
  (def hospital (h.model/novo-hospital))
  (def hospital (h.logic/chega-em hospital :espera "111"))
  (def hospital (h.logic/chega-em hospital :espera "222"))
  (def hospital (h.logic/chega-em hospital :espera "333"))
  ; funciona mas ja começamos a ter um treco no coração com
  ; esse simbolo global, com root binding sendo alterado a rodo
  (pprint hospital)

  (def hospital (h.logic/chega-em hospital :laboratorio1 "444"))
  (def hospital (h.logic/chega-em hospital :laboratorio3 "555"))
  (pprint hospital)

  (def hospital (h.logic/atende hospital :laboratorio1))
  (def hospital (h.logic/atende hospital :espera))
  (pprint hospital)

  )

(simula-um-dia)