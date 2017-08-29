# Reagent Material UI

[![Clojars Project](https://img.shields.io/clojars/v/reagent-material-ui.svg)](https://clojars.org/reagent-material-ui)

A reagent wrapper for [Material UI](http://www.material-ui.com/#/)
components.

Thanks to the maintainers
of [reagent-material](https://github.com/tuhlmann/reagent-material),
which I basically copied and turned into a package. Thanks also
to [om-material-ui](https://github.com/taylorSando/om-material-ui) for
providing the build process for the material ui javascript.

## Usage

Just add `[reagent-material-ui "0.2.5"]` to your `project.clj`, then require the components like so:

```clojure
(ns your-project.example
    (:require [reagent-material-ui.core :refer [AppBar Card]]))
```

You can then use the Material UI components as you would normal
reagent components. See
the
[Material UI docs](http://www.material-ui.com/#/components/app-bar)
for more info about the different components.

### A simple example

The following assumes you've included the font icon css in your
project based on
the
[instructions here](https://google.github.io/material-design-icons/).

```clojure
(ns my.project
  (:require [reagent-material-ui.core :as ui]))

;; some helpers
(def el reagent/as-element)
(defn icon [nme] [ui/FontIcon {:className "material-icons"} nme])
(defn color [nme] (aget ui/colors nme))

;; create a new theme based on the dark theme from Material UI
(defonce theme-defaults {:muiTheme (ui/getMuiTheme
                                    (-> ui/darkBaseTheme
                                        (js->clj :keywordize-keys true)
                                        (update :palette merge {:primary1Color (color "amber500")
                                                                :primary2Color (color "amber700")})
                                        clj->js))})

(defn simple-nav []
  (let [is-open? (atom false)
        close #(reset! is-open? false)]
    (fn []
      [:div
       [ui/AppBar {:title "yipgo" :onLeftIconButtonTouchTap #(reset! is-open? true)}]
       [ui/Drawer {:open @is-open? :docked false}
        [ui/List
         [ui/ListItem {:leftIcon (el [:i.material-icons "home"])
                       :on-click (fn []
                                   (accountant/navigate! "/")
                                   (close))}
          "Home"]
         [ui/Divider]
         (for [[doc details] @(rf/subscribe [:docs.list.by-name])]
           ^{:key doc} [ui/ListItem {:secondaryText "Something something"
                                     :rightIconButton (el [ui/IconMenu {:iconButtonElement (el [ui/IconButton {:touch true} [icon "more_vert"]])}
                                                           [ui/MenuItem "Delete"]])
                                     :onTouchTap (fn []
                                                   ;; some action or another, then close the menu
                                                   (close))}
                        doc])]
        [new-doc-modal close]]])))

(defn home-page []
  [ui/MuiThemeProvider theme-defaults
   [:div
    [simple-nav]
    [:div
     [:h2 "Welcome to a simple, example application."]]]])
```
