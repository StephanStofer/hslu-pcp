(ns week06.ex06_tests
  (:require [clojure.test :refer :all]
            [week06.ex06 :refer :all]))


(deftest redoubler-test
  (is (= (redoubler (list 1 2 3) 2) (list 2 4 6)))
  (is (= (redoubler (list 0 4 8) 2) (list 0 8 16)))
  (is (= (redoubler (list 13 -5 22) 3) (list 39 -15 66))))

(deftest delete-test
  (is (= (delete 3 (list 1 2 3 4)) (list 1 2 4)))
  (is (= (delete 'c ' (a b c d)) (list 'a 'b 'd)))
  (is (= (delete 'f '(a b (list 'a 'b 'c 'd) (list 'a 'b 'c 'd)))))
  (is (= (delete 'f ()) '()))
  (is (= (delete 'f (list 1 2 3 4)) (list 1 2 3 4))))

(deftest list-contains-test
  (is (= (list-contains? 'c '(a b c d)) true))
  (is (= (list-contains? 'f '(a b c d)) false))
  )

(deftest list-filter-test
  (is (= (list-filter > '(43 5 23 111) 29) '(43 111)))
  (is (= (list-filter = '(1 2 3 4 5) 2) '(2)))
  (is (= (list-filter < '(1 2 3 4 5) 2) '(1)))
  )

(deftest list-filter-test-a
  (is (= (list-filter = '(/ -) '/) '(/)))
  (is (= (list-filter = '(?) '(≥)) '()))
  )

(deftest list-filter-test-b
  (is (= (list-filter = '(a b c) 'a) '(a)))
  (is (= (list-filter = '(a b c) 'z) '()))
  )

(deftest list-filter-test-c
  (is (= (list-filter = '("clojure" "ist" "der" "Wahnsinn") "clojure") '("clojure")))
  (is (= (list-filter = '("empty" "list") "not") ()))
  (is (= (list-filter = '("PCP" "ist" "...") "PCP") '("PCP")))
  )

(deftest is-divisor-test
  (is (= (is-divisor? "dddd" 2) "provide integer values"))
  (is (= (is-divisor? 4 2) true))
  (is (= (is-divisor? 3 2) false))
  )

(deftest list-filter-test-ex7
  (is (= (list-filter is-divisor? '(3 4 7 10) 2) '(4 10)))
  (is (= (list-filter is-divisor? '(9 15 18 21) 3) '(9 15 18 21)))
  (is (= (list-filter is-divisor? '(1) 9) '()))
  )

(deftest compare-string<-test
  (is (= (compare-string<? "b" "a") false))
  (is (= (compare-string<? "a" "b") true))
  (is (= (compare-string<? "d" "z") true))
  )

(deftest compare-string>-test
  (is (= (compare-string>? "b" "a") true))
  (is (= (compare-string>? "a" "b") false))
  (is (= (compare-string>? "d" "z") false))
  )

(deftest sort-a-list-test
  (is (= (sort-a-list <= '(23 14 7 10)) '(7 10 14 23)))
  (is (= (sort-a-list <= '(1 19 43 2)) '(1 2 19 43)))
  (is (= (sort-a-list >= '(1 19 43 2)) '(43 19 2 1)))
  (is (= (sort-a-list compare-string<? '("b" "a" "z" "e")) '("a" "b" "e" "z")))
  (is (= (sort-a-list compare-string>? '("b" "a" "z" "e")) '("z" "e" "b" "a")))
  (is (= (sort-a-list compare-string>? '("b" "a" "a" "e")) '("e" "b" "a" "a")))
  )

(deftest abs-a-plus-b-test
  (is (= (abs-a-plus-b 2 -2) 4))
  (is (= (abs-a-plus-b -12 -3) 15))
  (is (= (abs-a-plus-b 3 3) 6)))

(deftest abs-a-op-b-test
  (is (= (abs-a-op-b * 2 -2) 4))
  (is (= (abs-a-op-b - -12 -3) 9))
  (is (= (abs-a-op-b / 3 3) 1)))

(run-tests)