{
 :foreign-libs [{:file "material_ui/material.min.js" ; can't use unminfied version, because "warnings" cause test to fail https://github.com/bensu/doo/issues/83
                 :file-min "material_ui/material.min.js"
                 :provides ["mui"]}]
 :externs ["material_ui/material.js"]
 }
