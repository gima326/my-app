(ns my-app.core
;;  (:require [reagent.core :as r])
  (:require [reagent.dom :as rd]))

(def greeting "Hello, World!")

(defn app []
  [:div greeting])

(defn stop []
  (js/console.log "Stopping..."))

(defn start []
　(do
    (js/console.log "Starting...")
;;  (r/render [app]
    (rd/render [app]
            (.getElementById js/document "app"))))

(defn ^:export init []
  (start))
