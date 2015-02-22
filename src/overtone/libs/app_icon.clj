(ns overtone.libs.app-icon
  (:use [clojure.java.io]
        [overtone.helpers.lib :only [branch]]
        [overtone.helpers.system :only [get-os]])
  (:import [java.awt.Toolkit]))

(defn- load-icon [path]
  (let [icon-url (clojure.java.io/resource path)]
    (-> (java.awt.Toolkit/getDefaultToolkit)
        (.createImage icon-url))))

(defn- set-icon [icon])
(defn- setup-icon [] )

(defonce __INIT-ICON__
  (setup-icon))
