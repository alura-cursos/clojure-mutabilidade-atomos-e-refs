(ns hospital.model)

(def fila-vazia clojure.lang.PersistentQueue/EMPTY)

(defn novo-hospital []
  {:espera       fila-vazia
   :laboratorio1 fila-vazia
   :laboratorio2 fila-vazia
   :laboratorio3 fila-vazia})