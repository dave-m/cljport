(ns clj-port.airport)

(defn uuid [] (str (java.util.UUID/randomUUID)))

(defn create-airport
  "Create an airport"
  [name]
  {:name name
    :id (uuid)
    :status :open
    :runways []})

(defn create-runway
  "A runway"
  []
  {:id (uuid)
    :in-use false
    :status :open})

;; Debate ref vs map, since we'll have a single point of control?
(defn create-airplane
  "An airplane"
  [name]
  {:id (uuid)
    :name name
    :status :in-flight})

(defn land-airplane
  [ap rw]
  ;; Apparently because clojure tries to call [] as a fn?
  (#(vector (assoc ap :status :preparing-to-land)
           (assoc rw :in-use true))))
