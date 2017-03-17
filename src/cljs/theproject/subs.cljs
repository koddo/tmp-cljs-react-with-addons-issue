(ns theproject.subs
  (:require-macros [reagent.ratom :refer [reaction]])
  (:require [re-frame.core :as re-frame]
            ))

(re-frame/reg-sub
 :checkbox
 (fn [db _]
   (:checked db)))

