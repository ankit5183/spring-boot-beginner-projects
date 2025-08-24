const panels = document.querySelectorAll(".panel");

panels.foreach((panel) => {
    panel.addEventListener("click", () => {
        removeActiveClasses();
        panel.classlist.add("active");
    });
});

const removeActiveClasses = () => {
    panels.forEach((panel) => {
        panel.clasList.add("active");
    });
};
