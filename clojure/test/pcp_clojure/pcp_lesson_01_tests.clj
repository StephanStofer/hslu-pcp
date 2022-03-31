(ns pcp-clojure.pcp_lesson_01_tests
  (:require [clojure.test :refer :all]
            [pcp-clojure.pcp-lesson-01 :refer :all]))

(deftest hello-world-test
  hello-world "Foo")

(deftest mean-of-squares-loop-test
  (is (= (mean-of-squares-loop 1) 1))
  (is (= (mean-of-squares-loop 2) 5/2))
  (is (= (mean-of-squares-loop 3) 14/3))
  (is (= (mean-of-squares-loop 4) 30/4)))

(deftest mean-of-squares-sequence-test
  (is (= (mean-of-squares-seq 1) 1))
  (is (= (mean-of-squares-seq 2) 5/2))
  (is (= (mean-of-squares-seq 3) 14/3))
  (is (= (mean-of-squares-seq 4) 30/4)))

(deftest mean-of-squares-recursive-test
  (is (= (mean-of-squares-rec 1) 1))
  (is (= (mean-of-squares-rec 2) 5/2))
  (is (= (mean-of-squares-rec 3) 14/3))
  (is (= (mean-of-squares-rec 4) 30/4)))

(deftest mean-of-squares-recur-test
  (is (= (mean-of-squares-recur 1) 1))
  (is (= (mean-of-squares-recur 2) 5/2))
  (is (= (mean-of-squares-recur 3) 14/3))
  (is (= (mean-of-squares-recur 4) 30/4)))

(deftest cinema-profits-tests
  (is (= (profit 8) 620.0))
  (is (= (profit 7) 687.5))
  (is (= (profit 6) 695.0))
  (is (= (profit 5) 642.5))
  (is (= (profit 6.5) 698.75)))

(run-tests)