# Reagent Material UI
[![Clojars Project](https://img.shields.io/clojars/v/reagent-material-ui.svg)](https://clojars.org/reagent-material-ui)

A reagent wrapper for [Material UI](http://www.material-ui.com/#/) components.

Thanks to the maintainers of [reagent-material](https://github.com/tuhlmann/reagent-material), which I basically copied and turned into a package. Thanks also to [om-material-ui](https://github.com/taylorSando/om-material-ui) for providing the build process for the material ui javascript.

## Usage

Just add `[reagent-material-ui "0.2.1"]` to your `project.clj`, then require the components like so:

```clojure
(ns your-project.example
    (:require [reagent-material-ui.core :refer [AppBar Card]]))
```

You can then use the Material UI components as you would normal reagent components. See the [Material UI docs](http://www.material-ui.com/#/components/app-bar) for more info about the different components.
