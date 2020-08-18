const animateHTML = function () {
    let elems;
    let windowHeight;

    function init() {
        elems = document.querySelectorAll('.start-raise-load', '.bar-load100-load', '.bar-load80-load', '.bar-load50-load');
        windowHeight = window.innerHeight;
        addEventHandlers();
        checkPosition();
    }

    function addEventHandlers() {
        window.addEventListener('scroll', checkPosition);
        window.addEventListener('resize', init);
    }

    function checkPosition() {
        for (let i = 0; i < elems.length; i++) {
            const positionFromTop = elems[i].getBoundingClientRect().top;
            if (positionFromTop - windowHeight <= 0) {
                elems[i].className = elems[i].className.replace(
                    'start-raise-load',
                    'start-raise'
                );
                elems[i].className = elems[i].className.replace(
                    'bar-load100-load',
                    'bar-load100'
                );
                elems[i].className = elems[i].className.replace(
                    'bar-load80-load',
                    'bar-load80'
                );
                elems[i].className = elems[i].className.replace(
                    'bar-load50-load',
                    'bar-load50'
                );
            }
        }
    }

    return {
        init: init
    };
};
animateHTML().init();