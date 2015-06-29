## [Dash](https://kapeli.com/dash) docset generator for [ESlint.org](http://eslint.org/)

original project from [dlokesh/clojuredocs-docset](https://github.com/dlokesh/clojuredocs-docset)

Edits from original project as follows:

  - Update clojure version (1.7)
  - Update all deps
  - Update to use current `clojure.java.jdbc` method *(previous methods have been deprecated)*
   

Performs the following:

* Mirror eslint.org/docs/rules using HTTrack (about 6mb)
* Copy html content to default dash docset template
* Parse all rules from eslint.org/docs/rules/index.html
* Populate searchIndex table in docSet.dsidx (Dash's sqlite db)

## Installation
Install the following dependencies:

	$ brew install httrack
	$ brew install leiningen


## Usage
Download [uberjar](releases) and run:

	$ java -jar eslint-docset-<version>-standalone.jar
	
or clone source to customize HTTrack in `config.clj` and run:

	$ lein run

Import the generated `eslint-docs.docset` into [Dash](https://kapeli.com/dash).

## License

* Copyright © 2013 Lokeshwaran
* Copyright © 2015 MiguelBermudez
* Distributed under the Eclipse Public License.
