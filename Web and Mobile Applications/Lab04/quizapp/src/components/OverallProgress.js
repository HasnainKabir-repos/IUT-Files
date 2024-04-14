import React from "react";

export default function OverallProgress({ Attempted, Total, Score }) {    
    return (
        <div className="text-sm text-white bg-blue-500 p-4 rounded-md">
            Quiz Progress: {Attempted} of {Total} | Score: {Score}
        </div>
    );
}