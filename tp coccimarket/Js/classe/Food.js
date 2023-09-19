export default class Food {
    constructor(id, text) {
        this.id = id;
        this.text = text;
    }

    render(){
        //crée un élément li en Html afin d'afficher la tâche
        const foodItem = document.createElement('li');
        foodItem.className = 'list-group-item d-flex';
        foodItem.textContent = this.text;
        //crée le bouton de modification
        const modifIcon = document.createElement('i');
        modifIcon.className = "bi bi-pencil-square";
        modifIcon.setAttribute('data-action', 'modify');
        modifIcon.setAttribute('data-info', this.id, this.text);
        foodItem.appendChild(modifIcon)
        //crée également le bouton de suppression
        const deleteIcon = document.createElement('i');
        deleteIcon.className = 'bi bi-trash3-fill'
        deleteIcon.setAttribute('data-action', 'delete');
        deleteIcon.setAttribute('data-info', this.id);
        foodItem.appendChild(deleteIcon);
        return foodItem;
    }
}

