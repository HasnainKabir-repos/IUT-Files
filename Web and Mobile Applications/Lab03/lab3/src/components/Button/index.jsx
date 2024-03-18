import React from "react";

class Button extends React.Component{
    constructor(props){
        super(props);
    }

    shouldComponentUpdate(){
        return false;
    }

    render(){
        console.log("Button rendered");
        return(
            <button type="submit">Submit</button>
        );
    }
}

export default Button;