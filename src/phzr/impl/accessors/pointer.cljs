(ns phzr.impl.accessors.pointer)

(def ^:private pointer-constants
  {:back-button "BACK_BUTTON"
   :eraser-button "ERASER_BUTTON"
   :forward-button "FORWARD_BUTTON"
   :left-button "LEFT_BUTTON"
   :middle-button "MIDDLE_BUTTON"
   :no-button "NO_BUTTON"
   :right-button "RIGHT_BUTTON"})

(def pointer-get-properties
  {:active "active"
   :back-button "backButton"
   :button "button"
   :circle "circle"
   :client-x "clientX"
   :client-y "clientY"
   :dirty "dirty"
   :duration "duration"
   :eraser-button "eraserButton"
   :exists "exists"
   :forward-button "forwardButton"
   :game "game"
   :id "id"
   :identifier "identifier"
   :is-down "isDown"
   :is-mouse "isMouse"
   :is-up "isUp"
   :left-button "leftButton"
   :middle-button "middleButton"
   :movement-x "movementX"
   :movement-y "movementY"
   :ms-since-last-click "msSinceLastClick"
   :page-x "pageX"
   :page-y "pageY"
   :pointer-id "pointerId"
   :position "position"
   :position-down "positionDown"
   :position-up "positionUp"
   :previous-tap-time "previousTapTime"
   :raw-movement-x "rawMovementX"
   :raw-movement-y "rawMovementY"
   :right-button "rightButton"
   :screen-x "screenX"
   :screen-y "screenY"
   :target "target"
   :target-object "targetObject"
   :time-down "timeDown"
   :time-up "timeUp"
   :total-touches "totalTouches"
   :type "type"
   :within-game "withinGame"
   :world-x "worldX"
   :world-y "worldY"
   :x "x"
   :y "y"})

(def pointer-set-properties
  {:active "active"
   :back-button "backButton"
   :button "button"
   :circle "circle"
   :client-x "clientX"
   :client-y "clientY"
   :dirty "dirty"
   :eraser-button "eraserButton"
   :exists "exists"
   :forward-button "forwardButton"
   :game "game"
   :id "id"
   :identifier "identifier"
   :is-down "isDown"
   :is-mouse "isMouse"
   :is-up "isUp"
   :left-button "leftButton"
   :middle-button "middleButton"
   :movement-x "movementX"
   :movement-y "movementY"
   :ms-since-last-click "msSinceLastClick"
   :page-x "pageX"
   :page-y "pageY"
   :pointer-id "pointerId"
   :position "position"
   :position-down "positionDown"
   :position-up "positionUp"
   :previous-tap-time "previousTapTime"
   :raw-movement-x "rawMovementX"
   :raw-movement-y "rawMovementY"
   :right-button "rightButton"
   :screen-x "screenX"
   :screen-y "screenY"
   :target "target"
   :target-object "targetObject"
   :time-down "timeDown"
   :time-up "timeUp"
   :total-touches "totalTouches"
   :within-game "withinGame"
   :x "x"
   :y "y"})