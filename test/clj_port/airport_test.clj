(ns clj-port.airport-test
  (:require [clj-port.airport :refer :all]
            [clojure.test :refer :all]))

(deftest test-airplane
  (testing "Landing"
    (let [ap (create-airplane "Plane 1")
          rw (create-runway)
          [lap lrw] (land-airplane ap rw)]
      (is (= :preparing-to-land (:status lap)))
      (is (true? (:in-use lrw))))))
