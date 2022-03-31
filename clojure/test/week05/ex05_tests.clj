(ns week05.ex05_tests
  (:require [clojure.test :refer :all]
            [week05.ex05 :refer :all]))

(deftest diagonal-rectangle-test
  (is (= (diagonal-rectangle 1 1) (Math/sqrt 2)))
  (is (= (diagonal-rectangle 5 3) (Math/sqrt 34)))
  (is (= (diagonal-rectangle 2 2) (* 2 (Math/sqrt 2)))))

(deftest complex-term-test
  (is (= (complex-term 1 1 1) (- 30))))

(deftest distance-to-origin-test
  (is (= (distance-to-origin (->Point 2 3)) (Math/sqrt 13))))

(deftest default-height-test
  (is (= (default-height "dfdf") "not a human!"))
  (is (= (default-height (->human 2 "m" 3)) 75.803))
  (is (= (default-height (->human 2 "f" 3)) 68.363))
  (is (= (default-height (->human 32 "f" 19)) 105.435))
  (is (= (default-height (->human 2 "3" 3)) 0))
  )

(deftest reduce-term-by-age-test
  (is (= (reduce-term-by-age "dfdf") "not a number!"))
  (is (= (reduce-term-by-age 29) 0))
  (is (= (reduce-term-by-age 30) 0.06))
  (is (= (reduce-term-by-age 31) 0.12))
  (is (= (reduce-term-by-age 32) 0.18))
  (is (= (reduce-term-by-age 41) 0.72))
  )

(deftest b-origin-test
  (is (= (b-origin "dfdf") "not a human!"))
  (is (= (b-origin (->human 2 "m" 3)) 75.803))
  (is (= (b-origin (->human 2 "f" 3)) 68.363))
  (is (= (b-origin (->human 32 "f" 19)) 105.615))
  (is (= (b-origin (->human 42 "m" 33)) 143.723))
  )

(run-tests)