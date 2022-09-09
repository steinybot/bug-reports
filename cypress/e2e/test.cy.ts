describe('Foo', function() {
	it('Bar', function() {
		cy.get('body').then((body) => {
			expect(body).to.have.focus
		})
	});
});