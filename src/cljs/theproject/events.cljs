(ns theproject.events
  (:require [re-frame.core :as re-frame]
            [theproject.db :as db]
            [cljs.spec :as s]
            ))

(def check-spec-interceptor
  (re-frame/after #(s/assert :theproject.db/good-state %)))

(re-frame/reg-event-db
 :initialize-db
 [check-spec-interceptor re-frame/debug]
 (fn  [_ _]
   db/default-db))

(re-frame/reg-event-db
 :set-checkbox
 [check-spec-interceptor re-frame/debug]
 (fn [db [_ checked]]
   (assoc db :checked checked)
   ))

;; )   ; end of trace-forms



