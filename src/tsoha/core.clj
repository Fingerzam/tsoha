(ns tsoha.core
  (:use compojure.core
        ring.adapter.jetty)
  (:require [compojure.route :as route]))

(defroutes example
  (GET "/" [] "<h1>Hello World!</h1>")
  (route/not-found "page not found"))

(defn boot []
  (run-jetty example {:port 8080}))
