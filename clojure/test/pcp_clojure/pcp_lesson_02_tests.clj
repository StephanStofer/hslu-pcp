(ns pcp-clojure.pcp_lesson_02_tests
  (:require [clojure.test :refer :all]
            [pcp-clojure.pcp-lesson-02 :refer :all]))

(deftest grade-test
  (is (= (grade "1") "Zahl eingeben!"))
  (is (= (grade 13.4) "Ganze Zahl 0 <= x <= 15 eingeben!"))
  (is (= (grade 14) "ausgezeichnet"))
  (is (= (grade 12) "sehr gut"))
  (is (= (grade 9) "gut"))
  (is (= (grade 5) "ausreichend"))
  (is (= (grade 0) "nicht erfüllt"))
  (is (= (grade 20) "Ganze Zahl 0 <= x <= 15 eingeben!")))

;; beware that clojure instance? require full qualified classname, replace dashes with underscores in the namespace
(deftest point-test
  (let [p1 (->Point 3 4)
        p2 (assoc p1 :y 5)]
    (true? (record? p1))
    (instance? pcp_clojure.pcp_lesson_02.Point p1)
    (true? (record? p2))
    (instance? pcp_clojure.pcp_lesson_02.Point p2)
    (is (= (:x p1) 3))
    (is (= (:y p1) 4))
    (is (= (:x p2) 3))
    (is (= (:y p2) 5))))

(deftest point-scale-test
  (let [p (->Point 2 3)
        q (point-scaling p 2.5)]
    (is (= (:x p) 2))
    (is (= (:y p) 3))
    (is (= (:x q) 5.0))
    (is (= (:y q) 7.5))))

(deftest dot-it-test
  (is (= (do-it symbol? 'abc) true))
  (is (= (do-it inc 5) 6))
  (is (= (do-it dec 5) 4)))

(deftest triangle-test
  (let [my-triangle (->Triangle (->Point 60 240) (->Point 270 210) (->Point 180 60))
        half (mp-a my-triangle)]
    (is (= (:x half) 225))
    (is (= (:y half) 135))))

(run-tests)
