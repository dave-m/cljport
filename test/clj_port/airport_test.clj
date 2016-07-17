(ns clj-port.airport-test
  (:require [clj-port.airport :refer :all]
            [clojure.test :refer :all]))

(deftest test-airplane
  (testing "Landing"
    (let [ap (airplane "Plane 1")
          rw (runway)
          [lap lrw] (land-airplane ap rw)]
      (is (= :landed (:status lap)))
      (is (true? (:in-use runway))))))
