(ns hospital.model)

(def fila_vazia clojure.lang.PersistentQueue/EMPTY)

(defn novo-hospital []
  {:espera       fila_vazia
   :laboratorio1 fila_vazia
   :laboratorio2 fila_vazia
   :laboratorio3 fila_vazia})