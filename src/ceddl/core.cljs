(ns ^:figwheel-always ceddl.core
    (:require))

(enable-console-print!)

(println "ceddl.core")

;; define your app data so that it doesn't get over-written on reload

(defonce app-state (atom {}))

(def uv js/window.digitalData)

(println uv)
