(ns clj-port.airport)

(defn uuid [] (str (java.util.UUID/randomUUID)))

(defn airport
  "Create an airport"
  [name]
  {:name name
    :id (uuid)
    :status :open
    :runways []})

(defn runway
  "A runway"
  []
  {:id (uuid)
    :in-use false
    :status :open})

;; Debate ref vs map, since we'll have a single point of control?
(defn airplane
  "An airplane"
  [name]
  {:id (uuid)
    :name name
    :status :in-flight})

(defn land-airplane
  [airplane runway]
  (airplane runway))
