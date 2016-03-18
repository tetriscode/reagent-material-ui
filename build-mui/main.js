(function () {
    var React = require('react'),
	reactDOM = require('react-dom'),
	materialUI = require('material-ui'),
	injectTapEventPlugin = require("react-tap-event-plugin");

    window.React = React;
    window.MaterialUI = materialUI;
    window.ReactDOM = reactDOM;

    //Needed for onTouchTap
    //Can go away when react 1.0 release
    //Check this repo:
    //https://github.com/zilverline/react-tap-event-plugin
    injectTapEventPlugin();
})();
