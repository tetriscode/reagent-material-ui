(defproject reagent-material-ui "0.2.5"
  :description "Material UI components for reagent"
  :url "https://github.com/DaveWM/reagent-material-ui"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.671"]
                 [reagent "0.7.0" :exclusions [cljsjs/react cljsjs/react-dom]]
                 [cljsjs/material-ui "0.19.0-0"]]
  :plugins [[lein-cljsbuild "1.1.6"]
            [lein-doo "0.1.7"]]
  :doo {:build "test"}
  :cljsbuild
  {:builds [{:id "test"
             :source-paths ["src" "test"]
             :compiler {:output-to "resources/public/js/testable.js"
                        :main reagent-material-ui.runner
                        :optimizations :none}}]})
