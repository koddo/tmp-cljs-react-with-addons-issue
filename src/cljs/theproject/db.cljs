(ns theproject.db
  (:require [cljs.spec :as s])
  (:require-macros [theproject.core :refer [only-keys]])
  )


(s/def ::checked boolean?)

(s/def ::good-state (only-keys :req-un [::checked]))


(def default-db
  {
   :checked false
   })


