(ns pcp-clojure.pcp_lesson_03_tests
  (:require [clojure.test :refer :all]
            [pcp-clojure.pcp-lesson-03 :refer :all]))

;; PCP Lists: count, first, nth, cons - insert at the beginning

(deftest list-read-test
  (let [l (list 1 2 3 4)]
    (is (= (first l) 1))
    (is (= (count (rest l)) 3))
    (is (= (first (cons 0 l)) 0))
    (is (= (count l) 4))
    (is (= (nth l 0) 1))
    (is (= (nth l 1) 2))
    (is (= (nth l 2) 3))
    (is (= (nth l 3) 4))))

(deftest list-stack-test
  (let [l (list 1 2 3 4)]
    (is (= (first l) (peek l)))
    (is (= (first (pop l)) 2))))

;; PCP Vectors: count, first, get, cons - insert at the beginning

(deftest vector-read-test
  (let [v (vector 1 2 3 4)]
    (is (= (count v) 4))
    (is (= (first v) 1))
    (is (= (first (cons 0 v)) 0))
    (is (= (count (rest v)) 3))
    (is (= (get v 0) 1))
    (is (= (get v 1) 2))
    (is (= (get v 2) 3))
    (is (= (get v 3) 4))
    (is (= (get v 4) nil))))

(deftest vector-modify-test
  (let [v1 (vector 1 2 3)
        v2 (conj v1 4 5 6)]
    (is (= (count v2) 6))
    (is (= (get v2 0) 1))
    (is (= (get v2 5) 6))))

(deftest list-stack-test
  (let [v (vector 1 2 3 4)]
    (is (= (peek v) (last v)))
    (is (= (first (pop v)) 1))))

;; Phone Book

(deftest phone-book-test
  (let [phone-book
        (list
          (->Person "Meier" 2051)
          (->Person "Müller" 3352))]
    (is (= (:name (first phone-book)) "Meier"))
    (is (= (:number (first phone-book)) 2051))
    (is (= (:name (nth phone-book 1)) "Müller"))))

;; Sum of list
(deftest sum-of-list-test
  (let [l (list 1 2 3)]
    (is (= (sum-list l) (reduce + l)))))

;; Double of list

(deftest redouble-test
  (let [l (list 1 2 3)
        d (redouble l)]
    (is (= (nth d 0) (* 2 (nth l 0))))
    (is (= (nth d 1) (* 2 (nth l 1))))
    (is (= (nth d 2) (* 2 (nth l 2))))))

;; insert into list

(deftest insert-into-list-test
  (let [l (list 46 34 37 11 23)
        sorted (sort-by-insert l)]
    (is (= (nth sorted 0) 11))
    (is (= (nth sorted 1) 23))
    (is (= (nth sorted 2) 34))
    (is (= (nth sorted 3) 37))
    (is (= (nth sorted 4) 46))))

(run-tests)
