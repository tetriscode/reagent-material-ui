; shamelessly stolen from https://github.com/tuhlmann/reagent-material

(ns reagent-material-ui.macros
  (:refer-clojure :exclude [List]))

(def material-tags
  '[AppBar
    AppCanvas
    AutoComplete
    Avatar
    Badge
    BeforeAfterWrapper
    Card
    CardActions
    CardExpandable
    CardHeader
    CardMedia
    CardText
    CardTitle
    Checkbox
    CircularProgress
    ClearFix
    DatePicker
    DatePickerDialog
    Dialog
    Divider
    DropDownMenu
    EnhancedButton
    FlatButton
    FloatingActionButton
    FontIcon
    GridList
    GridTile
    IconButton
    IconMenu
    LeftNav
    LinearProgress
    ListItem
    Menu
    MenuItem
    Mixins
    Overlay
    Paper
    Popover
    RadioButton
    RadioButtonGroup
    RaisedButton
    RefreshIndicator
    Ripples
    SelectField
    SelectableContainerEnhance
    Slider
    SvgIcon
    Styles
    Snackbar
    Tab
    Tabs
    Table
    TableBody
    TableFooter
    TableHeader
    TableHeaderColumn
    TableRow
    TableRowColumn
    Toggle
    TimePicker
    TextField
    Toolbar
    ToolbarGroup
    ToolbarSeparator
    ToolbarTitle
    Tooltip
    Utils

    ;; The following exist in cljs.core and shadow the core versions.
    ;; Some related errors I can see, but no solution yet for Stepper.
    List
    ; Stepper
    ])

(defn material-ui-react-import [tname]
  `(def ~tname
     (reagent.core/adapt-react-class (aget js/MaterialUI ~(name tname)))))

(defmacro export-material-ui-react-classes []
  `(do
     ~@(map material-ui-react-import material-tags)
     ))
