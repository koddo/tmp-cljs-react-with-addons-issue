(ns theproject.views
  (:require [re-frame.core :as re-frame]
            [reagent.core :as reagent]
            ))

;; home

(def <sub (comp deref re-frame.core/subscribe))
(def >evt re-frame.core/dispatch)

(def css-transition-group
  (reagent/adapt-react-class js/React.addons.CSSTransitionGroup))

(defn home-panel []
  [:div
   [:input {:type "checkbox"
            :checked (<sub [:checkbox])
            :on-change #(>evt [:set-checkbox (-> % .-target .-checked)])
            }]
   [css-transition-group {:transitionName "example" :transitionEnterTimeout 500 :transitionLeaveTimeout 500}
    (if (<sub [:checkbox])
      [:p "hello"])
    ]
   ])



