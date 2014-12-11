var windowSoftInputPlugin = {
    setInputAdjustPan: function () {
        cordova.exec(null, null, "windowSoftInputPlugin", "setInputAdjustPan", [""]);
    },
    
    setInputAdjustResize: function () {
        cordova.exec(null, null, "windowSoftInputPlugin", "setInputAdjustResize", [""]);
    }, 

    setInputAdjustUnspecified: function () {
        cordova.exec(null, null, "windowSoftInputPlugin", "setInputAdjustUnspecified", [""]);
    }
};
module.exports = windowSoftInputPlugin;
