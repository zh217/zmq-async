(defproject zh217/zmq-async "0.1.1"
            :description "A fork of zmq-async, a ZeroMQ 3 library for Clojure"
            :url "https://github.com/zh217/zmq-async"
            :license {:name "BSD" :url "http://www.opensource.org/licenses/BSD-3-Clause"}
            :min-lein-version "2.0.0"
            :dependencies [[com.taoensso/timbre "3.3.1"]
                           [org.clojure/core.match "0.2.2"]]
            :profiles {:dev {:global-vars  {*warn-on-reflection* true}
                             :dependencies [[midje "1.6.3"]
                                            [org.zeromq/jeromq "0.3.4"]
                                            [org.clojure/clojure "1.6.0"]
                                            [org.clojure/core.async "0.1.242.0-44b1e3-alpha"]]}})