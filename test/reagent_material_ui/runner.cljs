(ns reagent-material-ui.runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [reagent-material-ui.core-test]
            ))

(doo-tests 'reagent-material-ui.core-test)
         
