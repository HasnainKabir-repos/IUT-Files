import React from 'react';
import Button from '../Button';
import Task from '../Task';
class Form extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            items: [],
            task: { title: '', description: '' },
        };
    }
    
    handleSubmit = (event) => {
        event.preventDefault();
        const { title, description } = this.state.task;
        const newItem = { title, description };
        this.setState(prevState => ({
            items: prevState.items.concat(newItem)
        }));
    }
    
    render() {
        const { title, description } = this.state;
        document.title = this.state.items.length + " tasks";
        return (
            <>
            <div>
                {this.state.items.map((item, index) => (
                    <div key={index}>
                        <Task title={item.title} description={item.description} />
                    </div>
                ))}
            </div>
            <form onSubmit={this.handleSubmit}>
                <label>
                    Title: 
                    <input type="text" name="title" value={title} onChange={(e) => {
                        this.setState({ task: { title: e.target.value, description: this.state.task.description } });
                    }} />
                </label>
                <br />
                <label>
                    Description: 
                    <input type="text" name="description" value={description} onChange={(e) => {
                        this.setState({ task: { title: this.state.task.title, description: e.target.value } });
                    }} />
                </label>
                <br />
                <Button/>
            </form>
            </>
        );
    }
}

export default Form;