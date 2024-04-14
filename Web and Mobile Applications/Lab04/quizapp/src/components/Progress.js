import React from "react";

const Progress = ({ current, total }) => {
  return (
    <div className="text-sm text-white">
      Question {current} of {total}
    </div>
  );
}

export default Progress;