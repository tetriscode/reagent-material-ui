(function () {
  var React = require('react'),
    ReactAddons = require('react-addons'),
    materialUI = require('material-ui');

  React.classSet = ReactAddons.classSet;

  window.React = React;
  window.MaterialUI = materialUI;
})();
