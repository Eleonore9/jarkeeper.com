(defproject jarkeeper.com "0.3.0-SNAPSHOT"
  :description "Identify outdated dependencies in your Clojure project."
  :url "http://jarkeeper.com"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [compojure "1.1.6"]
                 [hiccup "1.0.4"]
                 [ring/ring-core "1.2.1"]
                 [ring-server "0.3.1"]
                 [org.clojure/tools.logging "0.2.6"]
                 [ring/ring-jetty-adapter "1.2.1"]
                 [ancient-clj "0.1.7"]]
  :ring {:handler jarkeeper.core/app }
  :plugins [[lein-ring "0.8.8"]]
  :profiles {
    :dev {
      :dependencies [[ring-mock "0.1.5"] [ring/ring-devel "1.2.1"]]}
    :prod {
      :ring {:open-browser? false, :stacktraces? false, :auto-reload? false}}})
