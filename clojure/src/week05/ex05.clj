(ns week05.ex05)

;; PCP Aufgabe 2
(defn square [x]
  (* x x))

(defn diagonal-rectangle [x y]
  (Math/sqrt (+ (square x) (square y))))

;; PCP Aufgabe 3

(defn complex-term [a b c]
  (+ (- (* 30 a)) (- (* 30 b)) (* 30 c))
  )

;; PCP Aufgabe 7
(defrecord Point [x y])
(defn distance-to-origin [p]
  (Math/sqrt (+ (square (:x p)) (square (:y p)))))


;; PCP Aufgabe 8
(defrecord human [age gender femur-length])
(defn default-height [h]
  (cond
    (not (instance? human h)) "not a human!"
    (= (:gender h) "m") (+ 69.089 (* 2.238 (:femur-length h)))
    (= (:gender h) "f") (+ 61.412 (* 2.317 (:femur-length h)))
    :else 0
    )
  )

(defn reduce-term-by-age [age]
  (cond
    (not (number? age)) "not a number!"
    (>= age 30) (* 0.06 (+ (- 29) age))
    :else 0
    )
  )

(defn b-origin [h]
  (cond
    (not (instance? human h)) "not a human!"
    :else (+ (default-height h) (reduce-term-by-age (:age h)))
    )
  )