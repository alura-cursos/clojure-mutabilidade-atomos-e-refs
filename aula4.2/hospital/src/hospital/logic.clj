(ns hospital.logic)

(defn cabe-na-fila? [hospital departamento]
  (-> hospital
      (get,,, departamento)
      count,,,
      (<,,, 5)))

(defn chega-em
  [hospital departamento pessoa]
  (if (cabe-na-fila? hospital departamento)
    (update hospital departamento conj pessoa)
    (throw (ex-info "Fila já está cheia" {:tentando-adicionar pessoa}))))


; funcao malvada que parece ser pura mas usa random
(defn chega-em-pausado
  [hospital departamento pessoa]
  (Thread/sleep (* (rand) 2000))
  (if (cabe-na-fila? hospital departamento)
    (do
      ; (Thread/sleep (* (rand) 2000))
        (update hospital departamento conj pessoa))
    (throw (ex-info "Fila já está cheia" {:tentando-adicionar pessoa}))))


; funcao malvada que parece ser pura mas usa random e altera estado do random e loga
(defn chega-em-pausado-logando
  [hospital departamento pessoa]
  (println "Tentando adicionar a pessoa" pessoa)
  (Thread/sleep (* (rand) 2000))
  (if (cabe-na-fila? hospital departamento)
    (do
      ; (Thread/sleep (* (rand) 2000))
      (println "Dando o update" pessoa)
      (update hospital departamento conj pessoa))
    (throw (ex-info "Fila já está cheia" {:tentando-adicionar pessoa}))))

(defn atende
  [hospital departamento]
  (update hospital departamento pop))