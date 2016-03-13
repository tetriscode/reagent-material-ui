; shamelessly stolen from https://github.com/tuhlmann/reagent-material

(ns reagent-material-ui.macros)

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
    HorizontalStep
    IconButton
    IconMenu
    LeftNav
    LinearProgress
    List
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
    Subheader
    SvgIcon
    Stepper
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
    VerticalStep
    ])

(defn material-ui-react-import [tname]
  `(def ~tname (reagent.core/adapt-react-class (aget js/MaterialUI ~(name tname)))))

(defmacro export-material-ui-react-classes []
  `(do
     ~@(map material-ui-react-import material-tags)
     ))
