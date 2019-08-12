(ns hospital.aula5
  (:use [clojure pprint])
  (:require [hospital.logic :as h.logic]
            [hospital.model :as h.model]))

; basicamente delegates
(defn chega-em! [hospital pessoa]
  (swap! hospital h.logic/chega-em :espera pessoa))

(defn transfere! [hospital de para]
  (swap! hospital h.logic/transfere de para))

(defn simula-um-dia []
  (let [hospital (atom (h.model/novo-hospital))]
    (chega-em! hospital "joão")
    (chega-em! hospital "maria")
    (chega-em! hospital "daniela")
    (chega-em! hospital "guilherme")
    (transfere! hospital :espera :laboratorio1)
    (pprint hospital)))

(simula-um-dia)