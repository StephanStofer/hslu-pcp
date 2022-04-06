(ns week06.ex06)

;; PCP Aufgabe 2
(defn redoubler [a-list multiplier]
  (if (empty? a-list) ()
                      (cons (* multiplier (first a-list)) (redoubler (rest a-list) multiplier)))
  )

;; PCP Aufgabe 4
(defn delete [item a-list]
  (cond
    (empty? a-list) ()
    :else (if (= (first a-list) item)
            (delete item (rest a-list))
            (cons (first a-list) (delete item (rest a-list))))
    )
  )

;; PCP Aufagbe 5
(defn list-contains? [item a-list]
  (cond
    (empty? a-list) false
    (= (first a-list) item) true
    :else (list-contains? item (rest a-list))
    )
  )

;; PCP Aufgabe 6
(defn list-filter [rel-op a-list value]
  (cond
    (empty? a-list) () :else
    (cond
      (rel-op (first a-list) value)
      (cons (first a-list)
            (list-filter rel-op (rest a-list) value)) :else (list-filter rel-op (rest a-list) value))
    )
  )

;; PCP Aufgabe 7
(defn is-divisor? [integer divisor]
  (cond
    (not (and (int? integer) (int? divisor))) "provide integer values" :else
    (= (mod integer divisor) 0)
    )
  )

;; PCP Aufgabe 8
; Einfügen in sortierter Liste
(defn insert [rel-op item a-list]
  (cond
    (empty? a-list) (list item)
    (rel-op item (first a-list)) (cons item a-list)
    :else (cons (first a-list) (insert rel-op item (rest a-list)))))
; Sortieren durch Einfügen
(defn sort-a-list [rel-op num-list]
  (cond
    (empty? num-list) ()
    :else (insert rel-op (first num-list)
                  (sort-a-list rel-op (rest num-list)))
    ))

(defn compare-string<? [a b]
  (<= (compare a b) 0))

(defn compare-string>? [a b]
  (>= (compare a b) 0))


;; Aufgabe 9

(defn abs [x]
  (max x (- x)))

(defn abs-a-plus-b [a b]
  (+ (abs a) (abs b))
  )

(defn abs-a-op-b [rel-op a b]
  (rel-op (abs a) (abs b))
  )

