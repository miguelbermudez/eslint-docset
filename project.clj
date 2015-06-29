(defproject eslint-docset "0.1.0"
  :description "Dash docset generator for Eslint.org Rules"
  :url "https://github.com/miguelbermudez/eslint-docset"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0-beta3"]
                 [org.jsoup/jsoup "1.8.2"]
                 [org.clojure/java.jdbc "0.3.7"]
                 [org.xerial/sqlite-jdbc "3.8.10.1"]
                 [commons-io "2.4"]]

  :main eslint-docset.core
  :aot [eslint-docset.core])
