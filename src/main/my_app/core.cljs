(ns my-app.core
;;  (:require [reagent.core :as r])
  (:require [reagent.dom :as rd]))

(def greeting "Hello, World!")

(defn fn-app []
  [:div greeting])

(defn stop []
  (js/console.log "Stopping..."))

(defn start []
　(do
    (js/console.log "Starting...")
;;  (r/render [fn-app]
    (rd/render [fn-app]
            (.getElementById js/document "app"))))

(defn ^:export init []
  (start))
